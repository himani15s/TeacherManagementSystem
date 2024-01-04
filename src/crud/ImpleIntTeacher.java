package crud;



import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ImpleIntTeacher  implements  TeacherInterface{
    Connection con;
    @Override
    public void createTeacher(Teacher t) {
       con=Dbconnection.createDBConnection();
       String query="insert into Teacher Values(?,?,?,?)";

        try {
            PreparedStatement pstm=con.prepareStatement(query);;
            pstm.setInt(1,t.getId());
            pstm.setString(2,t.getName());
            pstm.setDouble(3,t.getSalary());
            pstm.setInt(4,t.getAge());
            int count=pstm.executeUpdate();
            if(count!=0)
            {
                System.out.println("Teacher Enrolled");
            }




        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    @Override
    public void showAllTeacher() {
        con=Dbconnection.createDBConnection();
        String query="select * from Teacher";
        System.out.format("%s\t%s\t%s\t\t%s\n","Id","Name","Salary","Age");
        System.out.println("__________________________________________________________________________");
        try {
            Statement stmt= con.createStatement();
            ResultSet result=stmt.executeQuery(query);
            while (result.next())
            {
                System.out.format("%d\t%s\t%.2f\t%d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
                System.out.println("__________________________________________________________________________");

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void showTeacherBasedOnId(int id) {
        con=Dbconnection.createDBConnection();
        String query="select * from Teacher where id="+id;
        System.out.format("%s\t%s\t%s\t\t%s\n","Id","Name","Salary","Age");
        System.out.println("__________________________________________________________________________");
        try {
            Statement stmt= con.createStatement();
            ResultSet result=stmt.executeQuery(query);
            while (result.next())
            {
                System.out.format("%d\t%s\t%.2f\t%d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
                System.out.println("__________________________________________________________________________");

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void updateTeacher(int id, String name) {
        con=Dbconnection.createDBConnection();
        String query="update Teacher set name=?where id=? ";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.setInt(2,id);
            int count=pstm.executeUpdate();
            if(count!=0)
            {
                System.out.println("Teacher Updated") ;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }




    }

    @Override
    public void deleteTeacher(int id) {
        con=Dbconnection.createDBConnection();
        String query="Delete from Teacher Where id=?";
        try
        {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            int count=pstm.executeUpdate();
            if(count!=0)
            {
                System.out.println("Teacher Deleted succesfully") ;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
