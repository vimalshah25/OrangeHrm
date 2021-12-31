package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    LoginPage logInPage = new LoginPage();
    Dashboard dashboard = new Dashboard();
    AddEmployee addEmployee = new AddEmployee();
    EmployeeInformation employeeInformation = new EmployeeInformation();
    MyProfile myProfile = new MyProfile();


    DeleteEmployee deleteEmployee = new DeleteEmployee();




    @Given("user is in login screen")
    public void user_is_in_login_screen() {
        logInPage.enterDetailsAdminLogin();

    }
    @When("User Enter DefultUserId And Password On Login Page")
    public void user_enter_defult_user_id_and_password_on_login_page() {


    }
    @Then("user can Able to Log in And Come To dashboard page")
    public void user_can_able_to_log_in_and_come_to_dashboard_page() {
        dashboard.UserShouldBeAbleToClickPIMCategoryFromMainMenu();

    }
    @Then("user click on PIM category")
    public void user_click_on_pim_category() {


    }
    @Then("User Click on Add Empolyee Details Page")
    public void user_click_on_add_empolyee_details_page() {
        dashboard.userShouldBeAbleToSeeEmployeeList();
        addEmployee.userShouldBeAbleToFillRequireDetails();

    }
    @Then("user Enter All Empolyee Details")
    public void user_enter_all_empolyee_details() {



    }
    @Then("click on save Button")
    public void click_on_save_button() {


    }
    @Then("user come to Empolyee Details Profile page")
    public void user_come_to_empolyee_details_profile_page() {

    }
    @Then("user click on Welcome")
    public void user_click_on_welcome() {

    }
    @Then("from welcome user can able log out")
    public void from_welcome_user_can_able_log_out() {
        myProfile.userShouldBeAbleToViewProfile();

    }
    @Then("user come back to lOGIN page")
    public void user_come_back_to_l_ogin_page() {
        logInPage.enterValidAdminLoginDetails();

    }
    @When("user Enter Valid User id And Password")
    public void user_enter_valid_user_id_and_password() {

    }
    @Then("User Should able To loging Successfully")
    public void user_should_able_to_loging_successfully() {
        dashboard.userVerifyThatUserAtDeshboardPage();

    }

    @Given("user is in login page")
    public void user_is_in_login_page() {
        logInPage.enterDetailsAdminLogin();

    }
    @When("user enter Default user id and password")
    public void user_enter_default_user_id_and_password() {


    }
    @When("user should be able to log in")
    public void user_should_be_able_to_log_in() {

    }
    @When("user Click on the PIM category")
    public void user_click_on_the_pim_category() {
        dashboard.UserShouldBeAbleToClickPIMCategoryFromMainMenu();


    }
    @When("user Click on Employee List")
    public void user_click_on_employee_list() {




    }
    @When("user enter Employee name on Employee name search bar button")
    public void user_enter_employee_name_on_employee_name_search_bar_button() {
        deleteEmployee.enterLoginDetailsToDeleteEmployee();

    }
    @When("User click on search Button")
    public void user_click_on_search_button() {

    }
    @When("user Select name from the list")
    public void user_select_name_from_the_list() {

    }
    @When("user Click on delete button")
    public void user_click_on_delete_button() {

    }
    @When("user click on the alertbox to confirm the delete action")
    public void user_click_on_the_alertbox_to_confirm_the_delete_action() {

    }
    @Then("I user should be verify that Employee record Successfully deleted")
    public void i_user_should_be_verify_that_employee_record_successfully_deleted() {

    }











}
