package Queue;

	public class PathPossibleBetweenPetrolPumps {
		static class PetrolPump{ 
			int petrol;
			int distance;
			PetrolPump(int p, int d){
				petrol =p;
				distance = d;
			}
		}

public static int PathPossibleBetweenPetrolPumpsfun(PetrolPump data[]) {

	int start=0;
	int end = data.length-1;
	int n = data.length;
	int cur_pet=0;
	int finalStart = start;
	while(start!=end){
	//System.out.println("Petrol:::"+data[start].petrol+" distance::::"+data[start].distance);
		cur_pet = cur_pet+(data[start].petrol-data[start].distance);
	//	System.out.println("cur_pet:::"+cur_pet+" start:::"+start+" end::::"+end);
		if(cur_pet < 0){
			cur_pet=0;
			end= start;
			start = (start+1)%n;
			finalStart = start;
			if(start == 0){
				return -1;
			}
		}
		else{
			start = (start+1)%n;
		}
		//System.out.println("start:::"+start+" end::::"+end);
	}

	return finalStart;
	}
	public static void main(String[] args) {
		PetrolPump arr[] = {new PetrolPump(1,5), new PetrolPump(10,3),new PetrolPump(3,4)};
		System.out.println(PathPossibleBetweenPetrolPumpsfun(arr));
	}

}