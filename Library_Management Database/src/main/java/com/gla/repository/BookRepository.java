package com.gla.repository;

import com.gla.config.DBConnection;
import com.gla.model.Book;

import java.sql.*;
import java.util.*;

public class BookRepository {

    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM books");

            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("id"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setPublisher(rs.getString("publisher"));
                b.setPrice(rs.getInt("price"));
                b.setCategory(rs.getString("category"));
                b.setIssued(rs.getBoolean("issued"));
                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void addBook(Book b) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO books VALUES (?,?,?,?,?,?,false)");

            ps.setInt(1, b.getId());
            ps.setString(2, b.getTitle());
            ps.setString(3, b.getAuthor());
            ps.setString(4, b.getPublisher());
            ps.setInt(5, b.getPrice());
            ps.setString(6, b.getCategory());

            ps.executeUpdate();
            System.out.println("✅ Book Added");

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("❌ Book ID already exists");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeBook(int id) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM books WHERE id=?");

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("✅ Book Removed");
            else
                System.out.println("❌ Book Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateIssued(int id, boolean status) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE books SET issued=? WHERE id=?");

            ps.setBoolean(1, status);
            ps.setInt(2, id);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Book findById(int id) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM books WHERE id=?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("id"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setIssued(rs.getBoolean("issued"));
                return b;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}