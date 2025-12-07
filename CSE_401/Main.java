import java.util.*;

// ----------------------- Developer-----------------------
class Developer {
    private String name;
    private String projectName; 

    public Developer(String name, String projectName) {
        this.name = name;
        this.projectName = projectName;
    }

    public String getName() { return name; }
    public String getProjectName() { return projectName; }
    public void setProjectName(String p) { projectName = p; }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Role: Developer");
        System.out.println("Current Project: " + projectName);
    }
}

// ----------------------- ProjectManager  -----------------------
class ProjectManager {
    private String name;
    private String projectName;
    private List<Developer> developers = new ArrayList<>();

    public ProjectManager(String name, String projectName) {
        this.name = name;
        this.projectName = projectName;
    }

    public String getName() { return name; }
    public String getProjectName() { return projectName; }
    public List<Developer> getDevelopers() { return developers; }

    public void addDeveloper(Developer d) { developers.add(d); }
    public boolean removeDeveloper(String devName) {
        return developers.removeIf(d -> d.getName().equalsIgnoreCase(devName));
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Role: Project Manager");
        System.out.println("Current Project: " + projectName);
        System.out.println("Number of Supervisees: " + developers.size());
    }

    public void showHierarchy(String indent) {
        System.out.println(indent + "- " + name + " (" + projectName + ")");
        for (Developer d : developers) {
            System.out.println(indent + "    - " + d.getName());
        }
    }
}

// ----------------------- Project -----------------------
class Project {
    private String name;
    private ProjectManager manager; 

    public Project(String name) {
        this.name = name;
        this.manager = null;
    }

    public String getName() { return name; }
    public ProjectManager getManager() { return manager; }
    public void setManager(ProjectManager m) { manager = m; }

    public void showProject() {
        System.out.println("\nProject: " + name);
        if (manager == null) {
            System.out.println(" No manager assigned yet.");
        } else {
            manager.details();
            if (manager.getDevelopers().isEmpty()) {
                System.out.println("  No developers assigned.");
            } else {
                System.out.println("  Developers:");
                for (Developer d : manager.getDevelopers()) {
                    System.out.println("   - " + d.getName());
                }
            }
        }
    }

    public void showHierarchy(String indent) {
        System.out.println(indent + "- Project: " + name);
        if (manager != null) manager.showHierarchy(indent + "    ");
    }

    public boolean isEmpty() {
        return manager == null || manager.getDevelopers().isEmpty() && manager != null;
    }
}

// ----------------------- SoftwareCompany -----------------------
class SoftwareCompany {
    private String name;
    private List<Project> projects = new ArrayList<>();

    public SoftwareCompany(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public List<Project> getProjects() { return projects; }

    public boolean hasProject(String projectName) {
        for (Project p : projects)
            if (p.getName().equalsIgnoreCase(projectName)) return true;
        return false;
    }

    public void addProject(Project p) { projects.add(p); }
    public boolean removeProject(String projectName) {
        return projects.removeIf(p -> p.getName().equalsIgnoreCase(projectName));
    }

    public void showCompanyHierarchy() {
        System.out.println("\n- " + name);
        for (Project p : projects) {
            p.showHierarchy("    ");
        }
    }
}

// ----------------------- Main Application -----------------------
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<SoftwareCompany> companies = new ArrayList<>();

   
   private static Set<String> assignedManagers = new HashSet<>();
private static Set<String> assignedDevelopers = new HashSet<>();


    
    public static void main(String[] args) {
        while (true) {
            topPage();
        }
    }
    // ----------------------- Top Page -----------------------
    private static void topPage() {
        System.out.println("\n=== SOFTWARE COMPANY SYSTEM ===");
        System.out.println("1. Create Software Company");
        System.out.println("2. See List of Software Companies");
        System.out.println("3. Login to a Software Company");
        System.out.println("4. Exit Program");
        System.out.print("Choose an option: ");
        String opt = sc.nextLine().trim();
        switch (opt) {
            case "1":
                createCompanyPage();
                break;
            case "2":
                listCompaniesPage();
                break;
            case "3":
                loginCompanyPage();
                break;
            case "4":
                System.out.println("Exiting program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    private static void createCompanyPage() {
        System.out.print("\nEnter company name (or type BACK to go back): ");
        String name = sc.nextLine().trim();
        if (name.equalsIgnoreCase("BACK")) return;
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        for (SoftwareCompany c : companies) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println("A company with this name already exists.");
                return;
            }
        }
        companies.add(new SoftwareCompany(name));
        System.out.println("Company \"" + name + "\" created successfully.");
    }

    private static void listCompaniesPage() {
        System.out.println("\n--- Companies ---");
        if (companies.isEmpty()) {
            System.out.println("No companies created yet.");
            return;
        }
        for (int i = 0; i < companies.size(); i++) {
            System.out.println((i + 1) + ". " + companies.get(i).getName());
        }
        System.out.println("Type BACK to return.");
        String t = sc.nextLine().trim();
    }

    private static void loginCompanyPage() {
        if (companies.isEmpty()) {
            System.out.println("\nNo companies to login.");
            return;
        }
        System.out.println("\nSelect Company to login:");
        for (int i = 0; i < companies.size(); i++) {
            System.out.println((i + 1) + ". " + companies.get(i).getName());
        }
        System.out.print("Enter number or BACK: ");
        String in = sc.nextLine().trim();
        if (in.equalsIgnoreCase("BACK")) return;
        int idx;
        try {
            idx = Integer.parseInt(in) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }
        if (idx < 0 || idx >= companies.size()) {
            System.out.println("Invalid selection.");
            return;
        }
        companyPage(companies.get(idx));
    }

    // ----------------------- Company Page -----------------------
    private static void companyPage(SoftwareCompany company) {
        while (true) {
            System.out.println("\n=== COMPANY: " + company.getName() + " ===");
            System.out.println("1. Add Project");
            System.out.println("2. Show Projects");
            System.out.println("3. Delete Project");
            System.out.println("4. Logout ");
            System.out.println("5. Exit Program");
            System.out.print("Choose an option: ");
            String opt = sc.nextLine().trim();

            switch (opt) {
                case "1":
                    addProjectFlow(company);
                    break;
                case "2":
                    showProjectsFlow(company);
                    break;
                case "3":
                    deleteProjectFlow(company);
                    break;
                case "4":
                    return; // logout to main menu
                case "5":
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    // ----------------------- Add Project Flow (sequential) -----------------------
    private static void addProjectFlow(SoftwareCompany company) {
        System.out.print("\nEnter new project name (or BACK): ");
        String projectName = sc.nextLine().trim();
        if (projectName.equalsIgnoreCase("BACK")) return;
        if (projectName.isEmpty()) {
            System.out.println("Project name cannot be empty.");
            return;
        }
        if (company.hasProject(projectName)) {
            System.out.println("A project with this name already exists in this company.");
            return;
        }

        
        Project project = new Project(projectName);
        company.addProject(project);
        System.out.println("Project \"" + projectName + "\" created.");

        
        addManagerToProjectFlow(company, project);

        
        while (true) {
            System.out.println("\nProject \"" + projectName + "\" - Add Developers");
            System.out.println("1. Add a Developer");
            System.out.println("2. Finish");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();
            if (choice.equals("1")) {
                addDeveloperToProjectFlow(project);
            } else if (choice.equals("2")) {
                System.out.println("Finished with project \"" + projectName + "\".");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    // ----------------------- Add Manager to Project (sequential) -----------------------
    private static void addManagerToProjectFlow(SoftwareCompany company, Project project) {
        while (true) {
            System.out.print("\nEnter manager name for project \"" + project.getName() + "\" (or type 'REMOVE' to cancel project creation): ");
            String managerName = sc.nextLine().trim();
            if (managerName.equalsIgnoreCase("REMOVE")) {
                
                company.removeProject(project.getName());
                System.out.println("Project creation cancelled and project removed.");
                return;
            }
            if (managerName.isEmpty()) {
                System.out.println("Manager name cannot be empty.");
                continue;
            }
            if (isManagerAssigned(managerName)) {
                System.out.println("This manager is already assigned to another project. Cannot assign.");
                continue;
            }
            
            ProjectManager pm = new ProjectManager(managerName, project.getName());
            project.setManager(pm);
            assignedManagers.add(managerName.toLowerCase());
            System.out.println("Manager \"" + managerName + "\" assigned to project \"" + project.getName() + "\".");
            return;
        }
    }
    private static void addDeveloperToProjectFlow(Project project) {
        if (project.getManager() == null) {
            System.out.println("Add a manager first before adding developers.");
            return;
        }
        System.out.print("Enter developer name (or BACK): ");
        String devName = sc.nextLine().trim();
        if (devName.equalsIgnoreCase("BACK")) return;
        if (devName.isEmpty()) {
            System.out.println("Developer name cannot be empty.");
            return;
        }
        if (isDeveloperAssigned(devName)) {
            System.out.println("This developer is already assigned to another project. Cannot assign.");
            return;
        }
        Developer d = new Developer(devName, project.getName());
        project.getManager().addDeveloper(d);
        assignedDevelopers.add(devName.toLowerCase());
        System.out.println("Developer \"" + devName + "\" assigned to project \"" + project.getName() + "\".");
    }

    // ----------------------- Show Projects Flow -----------------------
    private static void showProjectsFlow(SoftwareCompany company) {
        List<Project> projects = company.getProjects();
        if (projects.isEmpty()) {
            System.out.println("\nNo projects in this company.");
            return;
        }
        while (true) {
            System.out.println("\n--- Projects in " + company.getName() + " ---");
            for (int i = 0; i < projects.size(); i++) {
                Project p = projects.get(i);
                String mgr = p.getManager() == null ? "No Manager" : p.getManager().getName();
                System.out.println((i + 1) + ". " + p.getName() + " \n   Manager: " + mgr  );
            } return;
            
        }
    }

    // ----------------------- Project Management Page -----------------------
    private static void projectManagementPage(Project project) {
        while (true) {
            System.out.println("\n=== Project: " + project.getName() + " ===");
            System.out.println("1. Show Project Details");
            System.out.println("2. Add Developer");
            System.out.println("3. Remove Developer");
            System.out.println("4. Remove Manager");
            System.out.println("5. Back to Company Projects");
            System.out.print("Choose: ");
            String opt = sc.nextLine().trim();
            switch (opt) {
                case "1":
                    project.showProject();
                    break;
                case "2":
                    addDeveloperToProjectFlow(project);
                    break;
                case "3":
                    removeDeveloperFromProjectFlow(project);
                    break;
                case "4":
                    removeManagerFromProjectFlow(project);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void removeDeveloperFromProjectFlow(Project project) {
        if (project.getManager() == null) {
            System.out.println("No manager assigned; no developers present.");
            return;
        }
        List<Developer> devs = project.getManager().getDevelopers();
        if (devs.isEmpty()) {
            System.out.println("No developers to remove.");
            return;
        }
        System.out.println("Developers:");
        for (int i = 0; i < devs.size(); i++) {
            System.out.println((i + 1) + ". " + devs.get(i).getName());
        }
        System.out.print("Enter number of developer to remove or BACK: ");
        String in = sc.nextLine().trim();
        if (in.equalsIgnoreCase("BACK")) return;
        int idx;
        try {
            idx = Integer.parseInt(in) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }
        if (idx < 0 || idx >= devs.size()) {
            System.out.println("Invalid selection.");
            return;
        }
        String name = devs.get(idx).getName();
        boolean removed = project.getManager().removeDeveloper(name);
        if (removed) {
            assignedDevelopers.remove(name.toLowerCase());
            System.out.println("Developer \"" + name + "\" removed from project \"" + project.getName() + "\".");
        } else {
            System.out.println("Removal failed.");
        }
    }

    private static void removeManagerFromProjectFlow(Project project) {
        if (project.getManager() == null) {
            System.out.println("No manager to remove.");
            return;
        }
        if (!project.getManager().getDevelopers().isEmpty()) {
            System.out.println("Remove all developers under this manager before removing the manager.");
            return;
        }
        String mgrName = project.getManager().getName();
        project.setManager(null);
        assignedManagers.remove(mgrName.toLowerCase());
        System.out.println("Manager \"" + mgrName + "\" removed from project \"" + project.getName() + "\".");
    }

    // ----------------------- Delete Project Flow -----------------------
    private static void deleteProjectFlow(SoftwareCompany company) {
        List<Project> projects = company.getProjects();
        if (projects.isEmpty()) {
            System.out.println("\nNo projects to delete.");
            return;
        }
        System.out.println("\nSelect project to delete:");
        for (int i = 0; i < projects.size(); i++) {
            Project p = projects.get(i);
            System.out.print((i + 1) + ". " + p.getName());
            if (p.getManager() != null) System.out.print(" (Manager: " + p.getManager().getName() + ")");
            System.out.println();
        }
        System.out.print("Enter number or BACK: ");
        String in = sc.nextLine().trim();
        if (in.equalsIgnoreCase("BACK")) return;
        int idx;
        try {
            idx = Integer.parseInt(in) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }
        if (idx < 0 || idx >= projects.size()) {
            System.out.println("Invalid selection.");
            return;
        }
        Project sel = projects.get(idx);
       
        if (sel.getManager() != null && !sel.getManager().getDevelopers().isEmpty()) {
            System.out.println("Remove all developers first before deleting the project.");
            return;
        }
        if (sel.getManager() != null) {
            
            assignedManagers.remove(sel.getManager().getName().toLowerCase());
        }
        
        company.removeProject(sel.getName());
        System.out.println("Project \"" + sel.getName() + "\" deleted from company \"" + company.getName() + "\".");
    }

    
    private static boolean isManagerAssigned(String managerName) {
        return assignedManagers.contains(managerName.toLowerCase());
    }

    private static boolean isDeveloperAssigned(String developerName) {
        return assignedDevelopers.contains(developerName.toLowerCase());
    }
}
