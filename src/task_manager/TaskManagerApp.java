package task_manager;

import task_manager.services.TaskManagerSystem;

public class TaskManagerApp {
  public static <String> void main(String[] args) {
    TaskManagerSystem.run();
  }
}
