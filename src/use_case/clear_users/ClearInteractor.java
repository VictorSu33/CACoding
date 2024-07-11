package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupUserDataAccessInterface;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.clearDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    public void execute() {
        ArrayList<String> users = clearDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        if (clearDataAccessObject.isClear()) {
            clearPresenter.prepareSuccessView(clearOutputData.getUsers());
        } else {
            clearPresenter.prepareFailView();
        }
    }
}
