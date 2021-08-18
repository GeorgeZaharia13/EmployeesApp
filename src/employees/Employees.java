package employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
class Employees {

    private int id;
    private String name;
    private int age;
    private String address;
    private int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employees() {
    }

    public Employees(int id, String name, int age, String address, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }



    static String displayAllEmployees() throws ClassNotFoundException {

        StringBuilder displayAll = new StringBuilder();
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            Statement st = conn.createStatement();
            st.executeQuery("select * from employees");
            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                displayAll.append(rs.getString("employees_id"));
                displayAll.append(" . ");
                displayAll.append(rs.getString("name"));
                displayAll.append(" / ");
                displayAll.append(rs.getString("age"));
                displayAll.append(" / ");
                displayAll.append(rs.getString("address"));
                displayAll.append(" / ");
                displayAll.append(rs.getString("salary"));
                displayAll.append("\n");
            }


        } catch (SQLException e) {
            displayAll.append("Error1 :");
            displayAll.append(e.getMessage());
        }

        return displayAll.toString();
    }

    static String displayBasedonName(String choice) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder rezultat = new StringBuilder();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            Statement st = conn.createStatement();
            st.executeQuery("select * from employees where name='" + choice + "'");

            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                rezultat.append(rs.getString("employees_id"));
                rezultat.append(" . ");
                rezultat.append(rs.getString("name"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("age"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("address"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("salary"));
                rezultat.append("\n");
            }

        } catch (SQLException e) {
            rezultat.append("Error!");
            rezultat.append(e.getMessage());
        }


        return rezultat.toString();
    }

    static String displayBasedonAge(String choice) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder rezultat = new StringBuilder();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            Statement st = conn.createStatement();
            st.executeQuery("select * from employees where age='" + choice + "'");

            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                rezultat.append(rs.getString("employees_id"));
                rezultat.append(" . ");
                rezultat.append(rs.getString("name"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("age"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("address"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("salary"));
                rezultat.append("\n");
            }

        } catch (SQLException e) {
            rezultat.append("Error! ");
            rezultat.append(e.getMessage());
        }

        return rezultat.toString();
    }

    static String displayBasedonAddress(String choice) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder rezultat = new StringBuilder();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            Statement st = conn.createStatement();
            st.executeQuery("select * from employees where address='" + choice + "'");

            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                rezultat.append(rs.getString("employees_id"));
                rezultat.append(" . ");
                rezultat.append(rs.getString("name"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("age"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("address"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("salary"));
                rezultat.append("\n");
            }

        } catch (SQLException e) {
            rezultat.append("Error! ");
            rezultat.append(e.getMessage());
        }

        return rezultat.toString();
    }

    static String displayBasedonSalary(String choice) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder rezultat = new StringBuilder();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            Statement st = conn.createStatement();
            st.executeQuery("select * from employees where salary='" + choice + "'");

            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                rezultat.append(rs.getString("zaposleni_id"));
                rezultat.append(" . ");
                rezultat.append(rs.getString("name"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("age"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("address"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("salary"));
                rezultat.append("\n");
            }

        } catch (SQLException e) {
            rezultat.append("Error! ");
            rezultat.append(e.getMessage());
        }

        return rezultat.toString();
    }

    static String displayBasedonId(String id) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder rezultat = new StringBuilder();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            Statement st = conn.createStatement();
            st.executeQuery("select * from employees where employees_id='" + id + "'");

            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                rezultat.append(rs.getString("employees_id"));
                rezultat.append(" . ");
                rezultat.append(rs.getString("name"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("age"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("address"));
                rezultat.append(" / ");
                rezultat.append(rs.getString("salary"));
                rezultat.append("\n");
            }

        } catch (SQLException e) {
            rezultat.append("Error! ");
            rezultat.append(e.getMessage());
        }

        return rezultat.toString();
    }



    static String entryEmployee(String name, String age, String address, String salary) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String message = "Entry completed successfully";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB", "root", "");) {
            PreparedStatement st = conn.prepareStatement("insert into zaposleni (ime,godine,adresa,dohodak) values (?,?,?,?)");
            st.setString(1, name);
            st.setString(2, age);
            st.setString(3, address);
            st.setString(4, salary);
            st.execute();

        } catch (SQLException e) {
            message = "Error! " + e.getMessage();
        }

        return message;
    }



    static void changeName(String id, String name) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("update employees set name=? where employees_id=?");
            st.setString(1, name);
            st.setString(2, id);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }

    static void changeAge(String id, String age) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("update employees set age=? where employees_id=?");
            st.setString(1, age);
            st.setString(2, id);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }

    static void changeAddress(String id, String address) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("update employees set address=? where employees_id=?");
            st.setString(1, address);
            st.setString(2, id);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }

    static void changeSalary(String id, String salary) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("update employees set salary=? where employees_id=?");
            st.setString(1, salary);
            st.setString(2, id);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }



    static void deleteBasedonId(String id) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("delete from employees where employees_id=?");

            st.setString(1, id);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }

    static void deleteBasedonName(String name) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("delete from employees where name=?");

            st.setString(1, name);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }

    static void deleteBasedonAge(String age) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("delete from employees where age=?");

            st.setString(1, age);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }

    static void deleteBasedonAddress(String address) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("delete from employees where address=?");

            st.setString(1, address);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }

    static void deleteBasedonSalary(String salary) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "");) {
            PreparedStatement st = conn.prepareStatement("delete from employees where salary=?");

            st.setString(1, salary);
            st.execute();

        } catch (SQLException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }


}


