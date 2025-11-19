# Tarot Oracle Makefile
JAVAC = javac
JAVA = java
SRCDIR = src/main/java
BINDIR = bin
MAIN_CLASS = org.Oracle.Oracle

SOURCES = $(SRCDIR)/org/Oracle/All.java $(SRCDIR)/org/Oracle/Ascii.java $(SRCDIR)/org/Oracle/Major.java $(SRCDIR)/org/Oracle/Oracle.java $(SRCDIR)/org/Oracle/Text.java

all: compile

compile:
	@echo "Compiling Tarot cards..."
	@mkdir -p $(BINDIR)
	$(JAVAC) -d $(BINDIR) $(SOURCES)
	@echo "Done!"

run: compile
	@echo "Starting oracle..."
	$(JAVA) -cp $(BINDIR) $(MAIN_CLASS)

clean:
	@echo "Cleaning..."
	rm -rf $(BINDIR)

rebuild: clean compile

help:
	@echo "Available commands:"
	@echo "  make all     - compile project"
	@echo "  make compile - compile only"
	@echo "  make run     - compile and run"
	@echo "  make clean   - clean binaries"
	@echo "  make rebuild - full recompile"
	@echo "  make help    - this help"

.PHONY: all compile run clean rebuild help