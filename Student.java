import java.util.*;
public class Student {
    private String st_id;//unique
    private String st_name;
    private float st_gpa;
    private String department;
    private String section;

    Student(String st_id, String st_name, float st_gpa, String department, String section)
    {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_gpa = st_gpa;
        this.department = department;
        this.section = section;
    }

    //get name
    public String getName()
    {
        return this.st_name;
    }
    //get id
    public String getId()
    {
        return this.st_id;
    }
    //get gpa
    public float getGpa()
    {
        return this.st_gpa;
    }
    //get branch
    public String getDepartment()
    {
        return this.department;
    }
    //get section
    public String getSection()
    {
        return this.section;
    }
    //set id
    public void setId(String id)
    {
        this.st_id = id;
    }
    //set name
    public void setName(String name)
    {
        this.st_name = name;
    }
    //set gpa
    public void setGpa(float gpa)
    {
        this.st_gpa = gpa;
    }
    //set branch
    public void setDepartment(String branch)
    {
        this.department = branch;
    }
    //set branch
    public void setSection(String section)
    {
        this.section = section;
    }
    @Override
    public String toString()
    {
        return "[ id :"+ st_id +", Name :"+st_name+", GPA :"+st_gpa+", Department :"+department+", Section :"+section+" ]";
    }
    
}
