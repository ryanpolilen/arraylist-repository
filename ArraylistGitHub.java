import java.util.ArrayList;

public class ArraylistGitHub{
	public static void main(String[]args){

	ArrayList<Integer> list1 = new ArrayList<>();
	for (int i = 0; i <10;i++){
		list1.add((int)(Math.random()*11)+10);
	}
		System.out.print(list1);
		System.out.println();


	ArrayList<Integer> list2 = new ArrayList<>();

	for (int i = 0; i <10;i++){
		list2.add((int)(Math.random()*11)+10);
	}

		System.out.print(list2);
		System.out.println();

		System.out.println(combineList(list1, list2));

		separateList(list1);
	}

	public static ArrayList<Integer> combineList(ArrayList<Integer> list1, ArrayList<Integer> list2){


			for (int i = 0; i < list2.size(); i++){
				list1.add(list2.get(i));
			}

	return list1;
	}
	public static void separateList(ArrayList<Integer> list1){
		for (int i = 0; i < list1.size();i++){
			System.out.print(list1.get(i)+",");

		}
	}
}