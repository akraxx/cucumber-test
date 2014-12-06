package fr.mmarie.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * Created by Maximilien on 05/12/2014.
 */
public class BowlingGameStefdefs {

    private BowlingGame bowlingGame;
    private Exception throwedException;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Given("^a new game$")
    public void a_new_game() {
        bowlingGame = new BowlingGame();
    }

    @Then("^the number of skittles  is (\\d+)$")
    public void the_result_is(double expected) {
        assertTrue(expected == bowlingGame.getSkittles());
    }

    @When("^(\\d+) skittles fall$")
    public void skittles_fall(int skittles) throws Throwable {
        try {
            // Express the Regexp above with the code you wish you had
            bowlingGame.skittlesFall(skittles);
        } catch (Exception e) {
            throwedException = e;
        }
    }

    @Then("^it fails$")
    public void it_fails() throws Throwable {
        // Express the Regexp above with the code you wish you had
        expectedEx.expect(IllegalArgumentException.class);
        assertThat(throwedException, is(notNullValue()));
        assertThat(throwedException.getMessage(), is("Number of fallen skittles can not be superior of the number of remaining skittles"));
    }
}
