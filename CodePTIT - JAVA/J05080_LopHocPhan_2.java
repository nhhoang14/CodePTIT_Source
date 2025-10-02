/* @author @nhhoang14 */

import java.util.*;

class HocPhan implements Comparable<HocPhan>{

    private String id, name, group, teacher;

    public HocPhan(String id, String name, String group, String teacher) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }

    public String getTeacher(){
        return this.teacher;
    }
    
    @Override
    public int compareTo(HocPhan other){
        if(this.id.equals(other.id)){
            return this.group.compareTo(other.group);
        }
        return this.id.compareTo(other.id);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s", this.id, this.name, this.group);
    }
}

public class J05080_LopHocPhan_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocPhan> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String group = sc.nextLine();
            String teacher = sc.nextLine();
            ds.add(new HocPhan(id, name, group, teacher));
        }
        Collections.sort(ds);
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String dsTeacher = sc.nextLine();
            System.out.printf("Danh sach cho giang vien %s:\n", dsTeacher);
            ds.forEach(e -> {
            if (e.getTeacher().equals(dsTeacher)) {
                System.out.println(e);
            }
        });
            
        }
    }
}