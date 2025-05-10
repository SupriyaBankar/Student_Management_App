
package com.student.manage;


public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentPhone;
    private String StudentCity;
    
    public Student(int StudentId,String StudentName,String StudentPhone,String StudentCity){
        super();
        this.StudentId=StudentId;
        this.StudentName=StudentName;
        this.StudentPhone=StudentPhone;
        this.StudentCity=StudentCity;
    }
     public Student(String StudentName,String StudentPhone,String StudentCity){
        super();
        this.StudentName = StudentName;
        this.StudentPhone=StudentPhone;
        this.StudentCity=StudentCity;
    }
      public Student(){
        super();
    }
     
    public void setStudentName(String StudentName){
          this.StudentName=StudentName;
      }
    public void setStudentPhone(String StudentPhone){
          this.StudentPhone=StudentPhone;
      }
    public void setStudentCity(String StudentCity){
          this.StudentCity=StudentCity;
      }
    
    public String getStudentName(){
        return StudentName;
    }
    public String getStudentPhone(){
        return StudentPhone;
    }
    public String getStudentCity(){
        return StudentCity;
    }
      @Override
      public String toString(){
          return "Student[ StudentId =" + StudentId +" StudentName = "+StudentName +" StudentPhone ="+StudentPhone +" StudentCity ="+StudentCity +" ]";
      }
}
