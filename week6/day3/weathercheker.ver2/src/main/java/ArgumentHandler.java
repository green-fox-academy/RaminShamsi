import joptsimple.OptionParser;
import joptsimple.OptionSet;


class ArgumentHandler {

  static Object[] getCountryCode(String[] args) {
    OptionParser myParser = new OptionParser();
    myParser.accepts("c").withRequiredArg();
    myParser.accepts("compare").withRequiredArg();
    OptionSet myOption = myParser.parse(args);
    Object[] countyCode = {myOption.valueOf("c"), myOption.valueOf("compare")};
    return countyCode;
  }
}
