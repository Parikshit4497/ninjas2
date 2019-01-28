package HashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on ०१-०८-२०१७.
 */
public class ContractTest {
    public static void main(String[] args) {
           Map<EmployeeKey,String> cache=loadEmpCache();
           EmployeeKey lookup=new EmployeeKey("101","111019174");
           String empname= cache.get(lookup);
        System.out.println("The employee name is " + empname);
    }
    static Map<EmployeeKey,String> loadEmpCache()
    {
        EmployeeKey ek1= new EmployeeKey("100","10101984");
        EmployeeKey ek2= new EmployeeKey("101","10101985");
        EmployeeKey ek3= new EmployeeKey("102","10101986");

        Map<EmployeeKey,String> cache= new HashMap<>();
        cache.put(ek1,"Bob");
        cache.put(ek2,"Steve");
        cache.put(ek3,"Robert");
        return cache;

    }
}
class EmployeeKey
{
    String empId;
    String dob;
    public EmployeeKey(String theId,String theDob)
    {
        empId=theId;
        dob=theDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeKey that = (EmployeeKey) o;

        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;
        return dob != null ? dob.equals(that.dob) : that.dob == null;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        return result;
    }
}