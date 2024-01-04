package crud;

public interface TeacherInterface {
//    Create teacher
    public void createTeacher(Teacher t);
//    show all teacher
    public void showAllTeacher();
//    show teacher base on id
    public void showTeacherBasedOnId(int id);
//    Update teacher
    public void updateTeacher(int id,String name);
//    delete
    public void deleteTeacher(int id);


}
