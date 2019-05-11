/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Student;
import java.util.*;

/**
 *
 * @author hp
 */
public interface StudentDeclaration {
   public long insertStudent(Student st);
   public long upDate(long id,Student st);
   public boolean delete (long id);
   public Student selectStudent(long id);
   public List selectAllStudents();
   public ArrayList searchByName(String name);
   
}
