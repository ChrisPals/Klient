package sdk;

import sdk.views.BookMainView;
import sdk.views.MainMenuView;
import sdk.views.UserMainView;
import sdk.views.BookMainViewMainView;


/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */

    public class Controller {
        private MainMenuView mainMenuView;
        private UserMainView userMainView;
        private BookMainView bookMainView;

        public Controller(){
            this.mainMenuView = new MainMenuView(this);
            this.bookMainView = new BookMainView(this);

        }
        public void showMainMenuView(){
            this.mainMenuView.mainMenu();
        }
        public MainMenuView getMainMenuView() {
            return mainMenuView;
        }
        //Hvorfor laver vi ikke setter??
    }

