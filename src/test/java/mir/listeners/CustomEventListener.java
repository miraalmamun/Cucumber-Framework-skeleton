package mir.listeners;


import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestCaseFinished;
import io.cucumber.plugin.event.TestCaseStarted;

public class CustomEventListener implements EventListener {
    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseStarted.class, this::handleTestCaseStarted);
        publisher.registerHandlerFor(TestCaseFinished.class, this::handleTestCaseFinished);
    }
    private void handleTestCaseStarted(TestCaseStarted event) {
        System.out.println("Test Case Started: " + event.getTestCase().getName());
    }
    private void handleTestCaseFinished(TestCaseFinished event) {
        System.out.println("Test Case Finished: " + event.getTestCase().getName() +
                " Result: " + event.getResult().getStatus());
    }
}
