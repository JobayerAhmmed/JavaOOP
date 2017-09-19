package basic;

import oop.classjava.Bicycle;

/**
 * Top level class modifier: public, package-private/default/no modifier
 * Member level: public, protected, no modifier, private
 *
 * public: class, package, subclass(may be in other package), world
 * protected: class, package, subclass(may be in other package)
 * no modifier: class, package
 * private: class
 *
 * For members:
 *          Use private unless you have a good reason not to.
 *          Avoid public fields except for constants.
 *
 * Instance methods can access instance variables and instance methods directly.
 * Instance methods can access class variables and class methods directly.
 * Class methods can access class variables and class methods directly.
 * Class methods cannot access instance variables or instance methods directly—they must use an object reference.
 * Class methods cannot use the this keyword as there is no instance for this to refer to.
 */
public class AccessModifier {
}
