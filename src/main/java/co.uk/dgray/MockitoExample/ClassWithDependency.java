package co.uk.dgray.MockitoExample;

class ClassWithDependency {

    private DependentClass dependentClass;

    ClassWithDependency(DependentClass dependentClass){
        this.dependentClass = dependentClass;
    }

    int callDependentMethod(){
        return dependentClass.anyMethod();
    }

}
