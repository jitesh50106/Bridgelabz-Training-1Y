package com.gla.repository;

import com.gla.config.DBConnection;
import java.sql.*;

public class IssueRepository {

    public void issueBook(int bookId, int studentId) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO issued_books(book_id,student_id,issue_date,returned) VALUES(?,?,?,false)");

            ps.setInt(1, bookId);
            ps.setInt(2, studentId);
            ps.setDate(3, new Date(System.currentTimeMillis()));

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void returnBook(int bookId, int studentId) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE issued_books SET returned=true, return_date=? WHERE book_id=? AND student_id=? AND returned=false");

            ps.setDate(1, new Date(System.currentTimeMillis()));
            ps.setInt(2, bookId);
            ps.setInt(3, studentId);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔥 ADMIN VIEW (GROUPED)
    public void getAllIssuedDetails() {

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT u.name, u.email, b.title, ib.issue_date, ib.returned " +
                    "FROM issued_books ib " +
                    "JOIN users u ON ib.student_id = u.id " +
                    "JOIN books b ON ib.book_id = b.id " +
                    "ORDER BY u.name";

            ResultSet rs = con.createStatement().executeQuery(sql);

            System.out.println("\n===== ALL STUDENT ISSUE DETAILS =====");

            String currentStudent = "";

            while (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("email");

                if (!name.equals(currentStudent)) {
                    System.out.println("\n👤 Student: " + name + " (" + email + ")");
                    currentStudent = name;
                }

                System.out.println(
                        "   📘 Book: " + rs.getString("title") +
                                " | Date: " + rs.getDate("issue_date") +
                                " | Status: " + (rs.getBoolean("returned") ? "Returned" : "Not Returned")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔥 STUDENT VIEW (MY BOOKS + COUNT)
    public void getBooksByStudent(String email) {

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT b.title, ib.issue_date, ib.returned " +
                    "FROM issued_books ib " +
                    "JOIN users u ON ib.student_id = u.id " +
                    "JOIN books b ON ib.book_id = b.id " +
                    "WHERE u.email = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- MY BOOKS ---");

            boolean found = false;

            while (rs.next()) {
                found = true;

                System.out.println(
                        "Book: " + rs.getString("title") +
                                " | Date: " + rs.getDate("issue_date") +
                                " | Status: " + (rs.getBoolean("returned") ? "Returned" : "Not Returned")
                );
            }

            if (!found) {
                System.out.println("No books issued.");
            }

            // 🔥 COUNT
            int count = getActiveBookCount(email);
            System.out.println("\n📊 Total Active Books: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔥 COUNT METHOD
    public int getActiveBookCount(String email) {

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT COUNT(*) AS total " +
                    "FROM issued_books ib " +
                    "JOIN users u ON ib.student_id = u.id " +
                    "WHERE u.email = ? AND ib.returned = false";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("total");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}