package OOP;

public class Task1_Point2DPoint3D {

        public static void main(String[] args) {
            Point2D point2D = new Point2D(0, 0); //loob uue objekti point2D (ja annab muutujatele algväärtused)
           // point2D.setXY(43, 65);  //muudab uue objektiga "set" meetodi käivitamisega eelmisel real antud väärtused ära.
            System.out.println(point2D); // pridib väljade X ja Y "uued andmed"



            Point3D point3D = new Point3D(43, 65, 0);



            //point3D.setXYZ(43, 64, 2);
            System.out.println(point3D);
        }
    }

