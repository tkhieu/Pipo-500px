package px500.pipoask.com.module.base;

/**
 * Created by Sandy on 12/25/15.
 */
public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}