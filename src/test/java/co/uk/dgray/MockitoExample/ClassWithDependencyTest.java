package co.uk.dgray.MockitoExample;

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
public class ClassWithDependencyTest {

    @Mock
    DependentClass dependentClass;

    private ClassWithDependency classWithDependency;

    @Before
    public void setup() {
        classWithDependency = new ClassWithDependency(dependentClass);
    }

    @Test
    public void classUnderTestMethod_callsAnyClient(){

        when(dependentClass.anyMethod()).thenReturn(5);

        int returnValue = classWithDependency.callDependentMethod();

        verify(dependentClass, Mockito.times(1)).anyMethod();

        assertThat(returnValue, is(5));

    }

}