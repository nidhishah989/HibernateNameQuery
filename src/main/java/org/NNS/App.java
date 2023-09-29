package org.NNS;


import org.NNS.DAO.EmployeeDAO;
import org.NNS.DAO.EmployeeDAOImpl;
import org.NNS.util.GenerateTable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //create tables in db.
        GenerateTable.main(args);
        EmployeeDAO employeedao = new EmployeeDAOImpl();
        employeedao.findEmployeeById();
        employeedao.findEmployeeByname();
        employeedao.ShowOfficeCodes_AsDepartment();
    }
}
