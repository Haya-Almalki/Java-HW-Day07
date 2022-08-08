import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<PayAble>list=new ArrayList<>();;

    public Company(String name) {
        this.name = name;
    }

    public boolean add(PayAble p){
        if(list.add(p))
            return true;
        return false;
    }
    public double computeAmount(){
        double total=0;
        for (int i = 0; i < list.size(); i++) {
            total+=list.get(i).computeAmount();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
