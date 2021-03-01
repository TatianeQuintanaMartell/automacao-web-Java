package SuiteDeTestes;

import TestCases.CompraComSucessoTestCase;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import TestCases.TesteDeLoginUsuarios;

@RunWith(JUnitPlatform.class)
//@SelectPackages("TestCases")
//@ExcludeClassNamePatterns("TesteDeLoginUsuarios.class")

//@SelectClasses(TesteDeLoginUsuarios.class)
@SelectClasses(CompraComSucessoTestCase.class)


public class TodosOsTestes {

}
