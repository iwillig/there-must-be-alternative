.DEFAULT_GOAL := check

.PHONY: lint
lint:
	black alternative

.PHONY: test
test:
	pytest

.PHONY: check
check: lint test
