package com.example.jerald.courseadviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerald on 10/4/2015.
 */
public class Courses {

        List<String> getCourses(String term) {

            List<String> courses = new ArrayList<String>();

            if (term.equals("1st Term")) {
                courses.add("NSTP101");
                courses.add("PERSEF1");
                courses.add("LASARE1");
                courses.add("FITWELL");
                courses.add("ENGALG1");
                courses.add("ENGTRIG");
                courses.add("ENGLCOM");
                courses.add("FILKOMU");
                courses.add("SOCTEC1");
                courses.add("GRAPONE");
            }

            else if (term.equals("2nd Term")) {
                courses.add("NSTP-R1/C1");
                courses.add("FTSPORT");
                courses.add("ANAGEOM");
                courses.add("SOLIMEN");
                courses.add("DIFFCAL");
                courses.add("ENGLRES");
                courses.add("FILDLAR");
                courses.add("TREDONE");
                courses.add("GRAPONE");
            }
            else if (term.equals("3rd Term")) {
                courses.add("SAS1000");
                courses.add("NSTP-R2/C2");
                courses.add("FTDANCE");
                courses.add("INTECAL");
                courses.add("ENGALG2");
                courses.add("SPEECOM");
                courses.add("CHEMONE");
                courses.add("LBYMEEA");
                courses.add("ENGPHY1");
                courses.add("LPYPH11");
                courses.add("LBYCH11");
            }
            else if (term.equals("4th Term")) {
                courses.add("ENGIANA");
                courses.add("ENGPHY2");
                courses.add("STATICS");
                courses.add("ENVIRON");
                courses.add("ENGSAFE");
                courses.add("LBYPH12");
                courses.add("FTTEAMS");
                courses.add("LBYEC71");
                courses.add("KASPIL1");
                courses.add("LASARE2");
            }
            else if (term.equals("5th Term")) {
                courses.add("ENTHERM");
                courses.add("TREDTWO");
                courses.add("BASICEE");
                courses.add("PRBSTAT");
                courses.add("DISMATH");
                courses.add("DYNAMIC");
                courses.add("LBYEC1A");
                courses.add("LBYEC72");
                courses.add("LBYCP3D");
            }
            else {
                courses.add("COMMATH");
                courses.add("LBYCP27");
                courses.add("ADVDEE1");
                courses.add("LBYCP1A");
                courses.add("ELEMECE");
                courses.add("LBYEC1B");
                courses.add("ECONENG");
                courses.add("DATASAL");
                courses.add("LBYCP12");
            }
            return courses;
        }
    }

