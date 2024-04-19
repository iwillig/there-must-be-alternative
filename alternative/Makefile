
.DEFAULT_GOAL := check

.PHONY:
clean:
	-rm -f dist/$(OUTPUT_FILENAME).html
	-rm -f dist/$(OUTPUT_FILENAME).pdf
	-rm junit.xml
	-rm -r target
	-rm -r public/js

.PHONY: rebel
rebel:
	clojure -M:rebel

.PHONY: outdated
outdated:
	clojure -M:outdated

.PHONY: lint
lint:
	clojure -M:lint --lint src/ test/ dev/

.PHONY: repl
repl:
	clj -M:tests:nREPL -m nrepl.cmdline

.PHONY: test
test:
	clojure -M:tests

.PHONY: watch
watch:
	npx shadow-cljs watch app

.PHONY: docs
docs:
	clojure -X:codox

.PHONY: check
check: outdated lint test docs
