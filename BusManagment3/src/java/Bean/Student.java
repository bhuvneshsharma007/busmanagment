/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student{
    @Id
    private String unm;
    private String pswd;
    private String dropdown;

    public String getUnm() {
        return unm;
    }

    public void setUnm(String unm) {
        this.unm = unm;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getDropdown() {
        return dropdown;
    }

    public void setDropdown(String dropdown) {
        this.dropdown = dropdown;
    }
  }