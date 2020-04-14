public class Student {
    private String sno;
    private String name;
    public  void Student(String sno, String name) {
        this .sno = sno;
        this .name = name;
    }
    public String getSno() {
        return this.sno;
    }
    public void setSno(String sno) {
        this .sno = sno;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this .name = name;
    }
}
