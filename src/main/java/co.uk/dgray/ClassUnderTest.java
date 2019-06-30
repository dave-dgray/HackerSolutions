package co.uk.dgray;

import static java.lang.Math.abs;

class ClassUnderTest {

    private DependentClass dependentClass;

    ClassUnderTest(DependentClass dependentClass){
        this.dependentClass = dependentClass;
    }

    int classUnderTestMethod(){
        return dependentClass.anyMethod();
    }

}
