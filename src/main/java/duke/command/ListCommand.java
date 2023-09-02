package duke.command;

import duke.Storage;
import duke.task.TaskList;

public class ListCommand extends Command {
    @Override
    public void execute(TaskList taskList, Storage storage) {
        this.printCommand(taskList);
    }

    @Override
    public void printCommand(TaskList taskList) {
        System.out.println("JonBird:");
        System.out.println("\tHere are the tasks in your list:");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println("\t\t"+ (i+1) + ". " + taskList.getTask(i).printTask());
        }
    }

    @Override
    public boolean isContinue() {
        return true;
    }
}
