package devmob.pedrogallon.calculadoramvc.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import devmob.pedrogallon.calculadoramvc.view.MainView;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {
    private MainPresenter presenter;
    @Mock
    private MainView view;

    @Before
    public void setup(){
        presenter = new MainPresenter(view);
        presenter.onCreate();
    }

    @Test
    public void testCalculo(){
        when(view.getValor1()).thenReturn("2");
        when(view.getValor2()).thenReturn("1");
        when(view.getOperador()).thenReturn("+");
        presenter.calculo();
        assertEquals("3", presenter.getResultado());

        when(view.getValor1()).thenReturn("2");
        when(view.getValor2()).thenReturn("3");
        when(view.getOperador()).thenReturn("*");
        presenter.calculo();
        assertEquals("6", presenter.getResultado());

        when(view.getValor1()).thenReturn("8");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("/");
        presenter.calculo();
        assertEquals("4", presenter.getResultado());

    }
}
