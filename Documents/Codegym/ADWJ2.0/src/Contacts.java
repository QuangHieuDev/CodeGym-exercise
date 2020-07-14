import java.util.regex.Pattern;

public class Contacts {
    private String fullName;
    private String phoneNumber;
    private String group;
    private String gender;
    private String address;
    private String birth;
    private String email;

    public Contacts(String fullName, String phoneNumber, String group, String gender, String address, String birth, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.birth = birth;
        this.email = email;
    }

    public void check(){
        boolean checkPhone = Pattern.matches("([+](84)|0)+([0-9]{8})\\b", phoneNumber);
        boolean checkEmail = Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return fullName + ','+ phoneNumber + ',' + group + ',' + gender + ',' + address + ',' + birth + ',' + email;
    }
}
