package co.uk.dgray;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ClassUnderTestTest {

    @Mock
    DependentClass dependentClass;

    private ClassUnderTest classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new ClassUnderTest(dependentClass);
    }

    @Test
    public void classUnderTestMethod_callsAnyClient(){

        when(dependentClass.anyMethod()).thenReturn(5);

        int returnValue = classUnderTest.classUnderTestMethod();

        verify(dependentClass, Mockito.times(1)).anyMethod();

        assertThat(returnValue, is(5));

    }

}