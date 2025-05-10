
package com.student.manage;
import java.sql.*;


public class StudentDao {
      public static boolean inserStudentToDB(Student st){
          boolean f=false;
          //jdbc code
          try{
            Connection con=ConnectionProvider.createConnection();
            
            String q="insert into students(sname,sphone,scity) values(?,?,?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            //set the values of pareameters
            
            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2,st.getStudentPhone());
            pstmt.setString(3,st.getStudentCity());
            
            //execute
            
            pstmt.executeUpdate();
            f=true;
            
          }catch(Exception e){
              e.printStackTrace();
          }
          return f;
      }
      
      public static boolean deleteById(int userId){
          boolean f=false;
          //jdbc code
          try{
            Connection con=ConnectionProvider.createConnection();
            
            String q="delete from students where sid=?";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            //set the values of pareameters
            
            pstmt.setInt(1,userId);
            
            
            //execute
            
            pstmt.executeUpdate();
            f=true;
            
          }catch(Exception e){
              e.printStackTrace();
          }
          return f;
      }
      public static void displayStudent(){
          
          //jdbc code
          try{
            Connection con=ConnectionProvider.createConnection();
            
            String q="select * from students";
            
            Statement stmt=con.createStatement();
            
            //set the values of pareamet
            //execute
            
            ResultSet rs= stmt.executeQuery(q);
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String phone =rs.getString(3);
                String city =rs.getString(4);
                
                System.out.println("id ="+id);
                System.out.println("name ="+name);
                System.out.println("phone ="+phone);
                System.out.println("city ="+city);
                System.out.println("-----------------------------------");
                
            }
            
            
          }catch(Exception e){
              e.printStackTrace();
          }
      }
      
      public static boolean updateStudent(int id,Student st){
          boolean f=false;
          try{
            Connection con=ConnectionProvider.createConnection();
            
            String q="update students set sname=?, sphone=?, scity=?  where sid=?";
            
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            //set the values of pareameters
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());
            pstmt.setInt(4, id);
            
            
            //execute
            
            pstmt.executeUpdate();
            f=true;
            
          }catch(Exception e){
              e.printStackTrace();
          }
          return f;
      }
}
