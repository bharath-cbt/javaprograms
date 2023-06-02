import sortapp.SortInterface;
import sortapp.subsortapp.SortImpl;
import searchingapp.SearchInterface;
import searchingimpl.SearchImpl;
class ExecutePackageB
{
 public static void main(String args[])
{
 SortImpl sort1=new SortImpl();
SearchImpl search1=new SearchImpl();
sort1.sort();
search1.search();
 }
}
