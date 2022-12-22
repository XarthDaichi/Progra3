// 
// Created by Xarthy on September 02, 2022.
//

#ifndef CONTAINER_H
#define CONTAINER_H

#include <iostream>
#include <vector>
#include <string>
#include <sstream>
#include <stdexcept>


// this is a generic class I made to be able to enter any object and search for objects with certain attributes 
// (e.g. in a bus system, routes having buses, you can search for specific routes with buses using the bus itself)
template<class T>
class Container {
protected:
	std::vector<T*> vec;
public:
	void push(T* const &);
	
	void pop();
	
	T* top() const;
	
	bool empty() const;

	void insert(int position, T* const &elem);
	
	void erase(T* const &elem);

	template<typename V>
	std::vector<T*> certain_objects(V &thing) const;

	std::vector<T*> all_objects() const;

	std::string to_string() const;
};

// this method is to see if the vector is empty
template<class T>
bool Container<T>::empty() const {
	return vec.empty();
}


// this method is to insert the element into the last space in the vector
template<class T>
void Container<T>::push(T* const &elem) {
	vec.push_back(elem);
}


// this method is to remove the last element in the vector
template<class T>
void Container<T>::pop() {
	if (vec.empty()) throw std::out_of_range("Container<>::pop: empty container");
	return vec.pop_back();
}

// this method is to return the last element in the vector
template<class T>
T* Container<T>::top() const {
	if (vec.empty()) throw std::out_of_range("Container<>::top: empty container");
	return vec.back();
}


// this method is to insert an element in a specific position
template<class T>
void Container<T>::insert(int position, T* const &elem) {
	auto iterator = vec.begin();
	if (vec.empty()) vec.push_back(elem);
	else vec.insert(iterator + position, elem);
}


// this method is to erase a specific element from the vector
template<class T>
void Container<T>::erase(T* const &elem) {
	if (vec.empty()) throw std::out_of_range("Container<T>::erase(): empty container");
	auto iterator = vec.begin();
	for (int i = 0; i < vec.size(); i++)
		if (vec[i] == elem) vec.erase(iterator+i);
}

// this method creates a new vector with the elements in the original that have the search parameter
template<class T>
template<typename V>
std::vector<T *> Container<T>::certain_objects(V &thing) const {
	vector <T *> newVector;
	stringstream searching;
	
	searching << thing;
	stringstream testing;
	for (T * i : vec) {
		testing << *i;
		if (testing.str().find(searching.str()) != string::npos) newVector.push_back(i);
		testing.str(("");
	}
	return newVector;
}

// this method returns the vector
template<class T>
std::vector<T *> Container<T>::all_objects() const {
	return vec;
}

template<class T>
std::string Container<T>::to_string() const {
	stringstream s;
	for (T * i : vec) s << i->to_string(); // have to define to_string method for objects being used, may be defined as toString(), just change that bit of code
	return s.str();
}

#endif //CONTAINER_H

