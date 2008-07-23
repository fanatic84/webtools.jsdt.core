/*******************************************************************************
 * Copyright (c) 2004, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.jsdt.core;


/**
 * Represents a type parameter defined by a type of a method
 * in a compilation unit or a class file.
 * <p>
 * Type parameters are obtained using {@link IType#getTypeParameter(String)} and
 * {@link IFunction#getTypeParameter(String)}.
 * </p><p>
 * Note that type parameters are not children of their declaring type or method. To get a list
 * of the type parameters use {@link IType#getTypeParameters()} for a type and use
 * {@link IFunction#getTypeParameters()} for a method.
 * </p>
 * <p><b>Note: This Interface only applies to ECMAScript 4 which is not yet supported</b></p>
 *
 * <p>
 * This interface is not intended to be implemented by clients.
 * </p>
 *
 *  
 * Provisional API: This class/interface is part of an interim API that is still under development and expected to 
 * change significantly before reaching stability. It is being made available at this early stage to solicit feedback 
 * from pioneering adopters on the understanding that any code that uses this API will almost certainly be broken 
 * (repeatedly) as the API evolves.
 */
public interface ITypeParameter extends IJavaScriptElement, ISourceReference {

	/**
	 * Returns the names of the class and interface bounds of this type parameter. Returns an empty
	 * array if this type parameter has no bounds. A bound name is the name as it appears in the
	 * source (without the <code>extends</code> keyword) if the type parameter comes from a
	 * compilation unit. It is the dot-separated fully qualified name of the bound if the type
	 * parameter comes from a class file.
	 *
	 * @return the names of the bounds
	 * @throws JavaScriptModelException if this element does not exist or if an
	 *		exception occurs while accessing its corresponding resource
	 */
	String[] getBounds() throws JavaScriptModelException;

	/**
	 * Returns the declaring member of this type parameter. This can be either an <code>IType</code>
	 * or an <code>IFunction</code>.
	 * <p>
	 * This is a handle-only method.
	 * </p>
	 *
	 * @return the declaring member of this type parameter.
	 */
	IMember getDeclaringMember();

	/**
	 * Returns the source range of this type parameter's name,
	 * or <code>null</code> if this type parameter does not have
	 * associated source code (for example, in a binary type).
	 *
	 * @exception JavaScriptModelException if this element does not exist or if an
	 *      exception occurs while accessing its corresponding resource.
	 * @return the source range of this type parameter's name,
	 * or <code>null</code> if this type parameter does not have
	 * associated source code (for example, in a binary type)
	 */
	ISourceRange getNameRange() throws JavaScriptModelException;
}