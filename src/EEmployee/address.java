package EEmployee;

public class address {
    private int eeid;
    private String phone;
    private String department;
    private String title;
    private String fname;
    private String lname;

    private String address;
    private String Streetnumber;
    private String zip;

    public address(int eeid, String phone, String department, String title,
                         String firstName, String LastName)
    {
        this.fname=firstName;
        this.lname=LastName;
        this.department=department;
        this.eeid=eeid;
        this.phone=phone;
        this.title=title;

    }
    public int getEeid() {
        return eeid;
    }

    public void setEeid(int eeid) {
        this.eeid = eeid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreetnumber() {
        return Streetnumber;
    }

    public void setStreetnumber(String streetnumber) {
        Streetnumber = streetnumber;
    }
    public void print()
    {
        System.out.println( "employeeid" + eeid +  "phone number" + phone + "\n"+
                "department" + department + "title" + title +
            "First Name" + fname + "Last Name" + lname);
    }
}
