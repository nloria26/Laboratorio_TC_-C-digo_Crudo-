
package Victimas;

import java.util.Objects;
/**
 *
 * @author bycha
 */
public class Victimas {
public String Cedula;
public String Name;
public String Birthdate;
public String Gender;
private String Email;
private int Phone;
private String Location ;

    public Victimas(String Cedula, String Name, String Birthdate, String Gender, String Email, int Phone, String Location) {
        
        this.Cedula = Cedula;
        this.Name = Name;
        this.Birthdate = Birthdate;
        this.Gender = Gender;
        this.Email = Email;
        this.Phone = Phone;
        this.Location = Location;
    }



    public String getCedula() {
        return Cedula;
    }

    public String getName() {
        return Name;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhone() {
        return Phone;
    }

    public String getLocation() {
        return Location;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.Cedula);
        hash = 67 * hash + Objects.hashCode(this.Location);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Victimas other = (Victimas) obj;
        if (!Objects.equals(this.Cedula, other.Cedula)) {
            return false;
        }
        return Objects.equals(this.Location, other.Location);
    }

   
    
}