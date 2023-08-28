// Plain Old Java Object & Record

public class StudentMain {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
//            Student s = new Student("S92300" + i,
//                    switch (i) {
//                        case 1 -> "Vishakha";
//                        case 2 -> "Mary";
//                        case 3 -> "Tim";
//                        case 4 -> "Harry";
//                        case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "28/08/2023",
//                    "Java Masterclass");
//
//            System.out.println(s);

            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Vishakha";
                        case 2 -> "Mary";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "28/08/2023",
                    "Java Masterclass");

            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "20/11/2023", "Java Materclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ",Java OCPExam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}
