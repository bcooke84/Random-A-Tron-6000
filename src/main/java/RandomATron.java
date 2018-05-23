import java.util.ArrayList;
import java.util.Collections;

public class RandomATron {

    private ArrayList<String> students;
    private ArrayList<String> selectedStudents;

    public RandomATron() {
        students = new ArrayList<>();
        Collections.addAll(students, "PAUL", "ANDREW", "DANIEL", "SARAH", "KELSIE", "LIAM", "ED", "SCOTT", "LYLE", "STUART", "CONNOR", "FRASER", "CALLUM", "CHRIS", "RUARIDH", "NIKHIL", "ROBERTO", "BRIAN");
        Collections.sort(students);
        selectedStudents = new ArrayList<>();
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public String randomName() {
        ArrayList<String> randomName = new ArrayList<>();
        Collections.shuffle(students);
        randomName.add(students.get(0));
        students.remove(0);
        Collections.sort(students);
        return randomName.get(0);
    }

    public ArrayList<String> randomPair() {
        ArrayList<String> randomPair = new ArrayList<>();
        Collections.shuffle(students);
//        if (students.size() > 1) {
        randomPair.add(students.get(0));
        randomPair.add(students.get(1));
        students.remove(1);
        students.remove(0);
        selectedStudents.addAll(randomPair);
        Collections.sort(students);
//        }
//        else if(students.size() == 1) {
//            randomPair.add(students.get(0));
//        }
        return randomPair;
    }

    public void addStudent(String name) {
        this.students.add(name.toUpperCase());
    }

    public void removeStudent(String name) {
        if (students.contains(name.toUpperCase())) {
        this.students.remove(name);}
    }

    public void updateName(String name, String newName) {
        int index = this.students.indexOf(name);
        this.students.set(index, newName);
    }

    public void refill() {
        students.clear();
        selectedStudents.clear();
        Collections.addAll(students, "PAUL", "ANDREW", "DANIEL", "SARAH", "KELSIE", "LIAM", "ED", "SCOTT", "LYLE", "STUART", "CONNOR", "FRASER", "CALLUM", "CHRIS", "RUARIDH", "NIKHIL", "ROBERTO", "BRIAN");
    }

}
