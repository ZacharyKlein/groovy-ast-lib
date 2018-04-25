package demo

import groovy.transform.CompilationUnitAware
import groovy.transform.CompileStatic
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.CompilationUnit
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@CompileStatic
@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class GroovyAST implements ASTTransformation, CompilationUnitAware {

    CompilationUnit unit


    @Override
    void visit(ASTNode[] nodes, SourceUnit source) {
        println "visiting..."

        println "targetDirectory: ${source.configuration.targetDirectory}"
    }

    @Override
    void setCompilationUnit(CompilationUnit unit) {
        this.unit = unit
    }
}
