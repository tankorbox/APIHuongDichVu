package tv.thanh.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;

import tv.thanh.model.SearchCriteria;
import tv.thanh.model.User;

public class UserSpecificationBuilder {
	private final List<SearchCriteria> params;

	public UserSpecificationBuilder() {
		params = new ArrayList<SearchCriteria>();
	}

	public UserSpecificationBuilder with(String key, String operation, Object value) {
		params.add(new SearchCriteria(key, operation, value));
		return this;
	}

	public Specification<User> build() {
		if (params.size() == 0) {
			return null;
		}

		List<Specification<User>> specs = new ArrayList<Specification<User>>();
		for (SearchCriteria param : params) {
			specs.add(new UserSpecification(param));
		}

		Specification<User> result = specs.get(0);
		for (int i = 1; i < specs.size(); i++) {
			result = Specifications.where(result).and(specs.get(i));
		}
		return result;
	}

}
