/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminator Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorDefinition#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getTerminatorDefinition()
 * @model
 * @generated
 */
public interface TerminatorDefinition extends AbstractNamed, Pragmatized, AbstractFeature {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getTerminatorDefinition_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminatorServiceDeclaration> getServices();

} // TerminatorDefinition
