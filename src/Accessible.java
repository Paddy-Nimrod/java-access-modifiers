/*
* Challenge:
* In the following interface declaration, what is the visibility of:
* 1. The accessible interface - It's accessible to all classes within the same package
* 2. the int variable SOME_CONSTANT. - public,  all interface variables are public static final
* 3. methodA - public
* 4. methodB and methodC - public
*
*/



interface Accessible{
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodc();
}