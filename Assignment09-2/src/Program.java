

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Objects;
	import java.util.Scanner;
	import java.util.Set;
	public class Program {
		package demo;

	class Project {
		private int id;
		private String title;
		private int teamSize;
		private double projectCost;
		private String technology;

		public Project() {

		}

		public Project(int id, String title, int teamSize, double projectCost, String technology) {
			this.id = id;
			this.title = title;
			this.teamSize = teamSize;
			this.projectCost = projectCost;
			this.technology = technology;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getTeamSize() {
			return teamSize;
		}

		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}

		public double getProjectCost() {
			return projectCost;
		}

		public void setProjectCost(double projectCost) {
			this.projectCost = projectCost;
		}

		public String getTechnology() {
			return technology;
		}

		public void setTechnology(String technology) {
			this.technology = technology;
		}

		@Override
		public String toString() {
			return "Project [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
					+ ", technology=" + technology + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Project other = (Project) obj;
			return id == other.id;
		}

	}

	class allProjectSortByCost implements Comparator<Project> {

		@Override
		public int compare(Project x, Project y) {
			return (int) (x.getProjectCost() - y.getProjectCost());
		}

	}

	public class Assignment09_2 {

		public static Set<Project> projectList = new HashSet<Project>();
		public static List<Project> copyProjectList = new ArrayList<>();
		public static Scanner scanner = new Scanner(System.in);

		public static int menuList() {
			System.out.println("1. Add Dummy data");
			System.out.println("2. Input a Project from user and add");
			System.out.println("3. Display all project");
			System.out.println("4. Delete a project by id");
			System.out.println("5. Copy All Projects from set to ArrayList");
			System.out.println("6. Display all project from list");
			System.out.println("7. Sort all project in list by cost");
			System.out.println("8. find project with max team size");
			System.out.print("Enter your choice - ");
			return scanner.nextInt();
		}

		public static Project[] dummyData() {
			Project[] project = new Project[6];

			project[0] = new Project(1, "Train Reservation System", 5, 5000000, "Java");
			project[1] = new Project(2, "Airline Reservation System", 3, 6000000, ".NET");
			project[2] = new Project(4, "Online Grocery Shop", 6, 3000000, "Java");
			project[3] = new Project(5, "Online Book Shop", 2, 3000000, ".NET");
			project[4] = new Project(3, "Online Jewelry Shop", 4, 4000000, "Java");
			project[5] = new Project(2, "Bus Reservation System", 3, 3500000, "JS");
			return project;
		}

		public static void getInstance(Project[] arr) {
			for (Project p : arr) {
				projectList.add(p);
			}
		}

		public static void addProject() {
			projectList.add(acceptProject());
		}

		public static Project acceptProject() {

			Project p = new Project();

			System.out.print("Enter the id - ");
			p.setId(scanner.nextInt());

			scanner.nextLine();

			System.out.print("Enter the title - ");
			p.setTitle(scanner.nextLine());

			System.out.print("Enter the teamSize - ");
			p.setTeamSize(scanner.nextInt());

			System.out.print("Enter the projectCost - ");
			p.setProjectCost(scanner.nextDouble());

			scanner.nextLine();

			System.out.print("Enter the technology - ");
			p.setTechnology(scanner.next());

			return p;
		}

		public static void displayAllProject() {
			Iterator<Project> p = projectList.iterator();

			while (p.hasNext()) {
				System.out.println(p.next().toString());
			}

		}

		public static int acceptProjectId() {
			System.out.print("Enter the Id - ");
			return scanner.nextInt();
		}

		public static boolean deleteProjectById() {
			int id = acceptProjectId();
			Project p = new Project();
			p.setId(id);
			
			boolean b = false;
			
			if(projectList.contains(p)) {
				b = projectList.remove(p);
			}
			return b;
		}

		public static void copyAllProjectFromArrayList() {
			if(!projectList.isEmpty()) {
				for (Project list : projectList) {
					copyProjectList.add(list);
				}
				System.out.println("Copy successful..");
			}else {
				System.out.println("ArrayList is empty..");
			}
		}

		public static void displayAllProjectFromArrayList() {
//			for (Project list : copyProjectList) {
//				System.out.println(list.toString());
//			}
			
			copyProjectList.forEach(e -> System.out.println(e.toString()));
		}

		public static void printAllProjectByCost(Comparator<Project> comparator) {

			Project[] arr = new Project[projectList.size()];

			int i = 0;
			for (Project a : projectList) {
				arr[i] = a;
				i++;
			}

			Arrays.sort(arr, comparator);

			for (Project p : arr) {
				System.out.println(p.toString());
			}

		}

		

		public static void main(String[] args) {
			int choice;
			while((choice = menuList())!= 0) {
				switch (choice) {
				case 1:
					getInstance(dummyData());
					break;
					
				case 2:
					addProject();
					break;
					
				case 3:
					displayAllProject();
					break;
				
				case 4:
					System.out.println(deleteProjectById() ? "Delete Succesful" : "id not found");
					break;
					
				case 5:
					copyAllProjectFromArrayList();
					break;
					
				case 6:
					displayAllProjectFromArrayList();
					break;
					
				case 7:
					Comparator<Project> p = new allProjectSortByCost();
					printAllProjectByCost(p);
					break;
					
				case 8:
					System.out.println(Collections.max(projectList,(x,y) -> x.getTeamSize() - y.getTeamSize()));
					break;
					
				default:
					System.out.println("Invalid Input..");
					break;
				}
			}
		}
	}

}
