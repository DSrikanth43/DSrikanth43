package com.zensar.training.bean;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;



/**
 * @author SD65912
 *
 */
@Entity
@Table(name="olx_user_table")
public class OlxUser {
       @NonNull
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       private int olxUserId;
       @NonNull
       private String userName;
       @NonNull
       private String password;
       @NonNull
       private String roles;
       
       private String firstName;
       private String lastName;
       @NonNull
       private String email;
       
       private String phoneNumber;
       
       @Enumerated(EnumType.STRING)
     private  Active active;
       
       
       public OlxUser() {
    	   super();
       }
       
       
       public OlxUser(int olxUserId) {
    	   super();
    	   this.olxUserId = olxUserId;
    	   
       }
       
       public OlxUser(int olxUserId, String userName, String password, String roles, String firstName, String lastName,
    		   String email, String phoneNumber, Active active) {
    	   super();
    	   this.olxUserId = olxUserId;
    	   this.userName = userName;
    	   this.password = password;
    	   this.roles = roles;
    	   this.firstName = firstName;
    	   this.lastName = lastName;
    	   this.email = email;
    	   this.phoneNumber = phoneNumber;
    	   this.active = active;
    	   
       }
       
       
       public int getOlxUserId() {
    	   return olxUserId;
       }
       
       
       public void setOlxUserId(int olxUserId) {
    	   this.olxUserId = olxUserId;
       }
       
       
       public String getUserName() {
    	   return userName;
       }
       
       public void setUserName(String userName) {
    	   this.userName = userName;
       }
       
       
       public String getPassword() {
    	   return password;
       }
       
       public void setPassword(String Password, String password) {
    	   this.password = password ;
       }
       
       public String getRoles() {
    	   return roles;
       }
       
       public void setRoles(String roles) {
    	  this.roles = roles; 
       }
       
       public String getFirstName() {
    	   return firstName;
       }
       
       public void setFirstName(String firstName) {
    	   this.firstName = firstName;
       }
       
       public String getlastName() {
    	   return lastName;
       }
       
       public void setLastName(String lastName) {
    	   this.lastName = lastName;
       }
       
       public String getEmail() {
    	   return email;
       }
       
       public void setEmail(String email) {
    	   this.email = email;
       }
       
       public String getPhoneNumber() {
    	   return phoneNumber; 
       }
       
       public void setPhoneNumber(String phoneNumber) {
    	   this.phoneNumber = phoneNumber;
       }
       
       public Active getActive() {
    	   return active;
       }
       
       public void setActive(Active active) {
    	   this.active = active;
       }
       
       
       
       @Override
       public String toString() {
    	   return "Users [olxUserId=" + olxUserId + ", userName=" + userName + ", password=" + password + ", roles= "
       + roles + ", firstName=" + firstName + ", lastName=" + lastName +", email=" + email+", phoneNumber=" + phoneNumber+ ", active="+ active + "]";
       } 
       
       
       @Override
       public int hashCode() {
    	   return Objects.hash(active,email,firstName,lastName,olxUserId,password,phoneNumber,roles,userName);
       }
       
       
       
       
       @Override
       public boolean equals(Object obj) {
    	   if(this == obj)
    		   return true;
    	   if(obj == null)
    		   return false;
    	   if(getClass()!=obj.getClass())
    		   return false;
    	   OlxUser other = (OlxUser)obj;
    	   return Objects.equals(active,other.active) && Objects.equals(email,other.email)
    			   && Objects.equals(firstName, other.firstName)&& Objects.equals(lastName, other.lastName)
    			   && olxUserId == other.olxUserId && Objects.equals(password, other.password)
    			   && Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(roles, other.roles)
    			   && Objects.equals(userName, other.userName);
    		   
    		    }
       
}

