public class Main {


    public static void main(String[] args) {

   Person p1 = new Person("Sergey", 30, 'M');
   Person p2 = new Person("Anna", 20, 'F');

   Person[] personArray = {p1, p2};

   Person pMin = PersonHelper.getMinAge(personArray);


   Worker worker = new Worker("Sergey", 30, 'M', 10000);
   worker.setSalary(1000);
   worker.setName("Sergey");
   worker.setAge(30);

        System.out.println(worker.getSalary());




}
}

