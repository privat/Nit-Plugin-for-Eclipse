/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAModule(AModule node);
    void caseAModuledecl(AModuledecl node);
    void caseAStdImport(AStdImport node);
    void caseANoImport(ANoImport node);
    void caseAPublicVisibility(APublicVisibility node);
    void caseAPrivateVisibility(APrivateVisibility node);
    void caseAProtectedVisibility(AProtectedVisibility node);
    void caseAIntrudeVisibility(AIntrudeVisibility node);
    void caseAStdClassdef(AStdClassdef node);
    void caseATopClassdef(ATopClassdef node);
    void caseAMainClassdef(AMainClassdef node);
    void caseAConcreteClasskind(AConcreteClasskind node);
    void caseAAbstractClasskind(AAbstractClasskind node);
    void caseAInterfaceClasskind(AInterfaceClasskind node);
    void caseAEnumClasskind(AEnumClasskind node);
    void caseAExternClasskind(AExternClasskind node);
    void caseAFormaldef(AFormaldef node);
    void caseASuperclass(ASuperclass node);
    void caseAAttrPropdef(AAttrPropdef node);
    void caseAMethPropdef(AMethPropdef node);
    void caseADeferredMethPropdef(ADeferredMethPropdef node);
    void caseAInternMethPropdef(AInternMethPropdef node);
    void caseAExternMethPropdef(AExternMethPropdef node);
    void caseAConcreteMethPropdef(AConcreteMethPropdef node);
    void caseAConcreteInitPropdef(AConcreteInitPropdef node);
    void caseAExternInitPropdef(AExternInitPropdef node);
    void caseAMainMethPropdef(AMainMethPropdef node);
    void caseATypePropdef(ATypePropdef node);
    void caseAReadAble(AReadAble node);
    void caseAWriteAble(AWriteAble node);
    void caseAIdMethid(AIdMethid node);
    void caseAPlusMethid(APlusMethid node);
    void caseAMinusMethid(AMinusMethid node);
    void caseAStarMethid(AStarMethid node);
    void caseASlashMethid(ASlashMethid node);
    void caseAPercentMethid(APercentMethid node);
    void caseAEqMethid(AEqMethid node);
    void caseANeMethid(ANeMethid node);
    void caseALeMethid(ALeMethid node);
    void caseAGeMethid(AGeMethid node);
    void caseALtMethid(ALtMethid node);
    void caseAGtMethid(AGtMethid node);
    void caseALlMethid(ALlMethid node);
    void caseAGgMethid(AGgMethid node);
    void caseABraMethid(ABraMethid node);
    void caseAStarshipMethid(AStarshipMethid node);
    void caseAAssignMethid(AAssignMethid node);
    void caseABraassignMethid(ABraassignMethid node);
    void caseASignature(ASignature node);
    void caseAParam(AParam node);
    void caseAClosureDecl(AClosureDecl node);
    void caseAType(AType node);
    void caseALabel(ALabel node);
    void caseABlockExpr(ABlockExpr node);
    void caseAVardeclExpr(AVardeclExpr node);
    void caseAReturnExpr(AReturnExpr node);
    void caseABreakExpr(ABreakExpr node);
    void caseAAbortExpr(AAbortExpr node);
    void caseAContinueExpr(AContinueExpr node);
    void caseADoExpr(ADoExpr node);
    void caseAIfExpr(AIfExpr node);
    void caseAIfexprExpr(AIfexprExpr node);
    void caseAWhileExpr(AWhileExpr node);
    void caseALoopExpr(ALoopExpr node);
    void caseAForExpr(AForExpr node);
    void caseAAssertExpr(AAssertExpr node);
    void caseAOnceExpr(AOnceExpr node);
    void caseASendExpr(ASendExpr node);
    void caseABinopExpr(ABinopExpr node);
    void caseAOrExpr(AOrExpr node);
    void caseAAndExpr(AAndExpr node);
    void caseAOrElseExpr(AOrElseExpr node);
    void caseANotExpr(ANotExpr node);
    void caseAEqExpr(AEqExpr node);
    void caseAEeExpr(AEeExpr node);
    void caseANeExpr(ANeExpr node);
    void caseALtExpr(ALtExpr node);
    void caseALeExpr(ALeExpr node);
    void caseALlExpr(ALlExpr node);
    void caseAGtExpr(AGtExpr node);
    void caseAGeExpr(AGeExpr node);
    void caseAGgExpr(AGgExpr node);
    void caseAIsaExpr(AIsaExpr node);
    void caseAPlusExpr(APlusExpr node);
    void caseAMinusExpr(AMinusExpr node);
    void caseAStarshipExpr(AStarshipExpr node);
    void caseAStarExpr(AStarExpr node);
    void caseASlashExpr(ASlashExpr node);
    void caseAPercentExpr(APercentExpr node);
    void caseAUminusExpr(AUminusExpr node);
    void caseANewExpr(ANewExpr node);
    void caseAAttrExpr(AAttrExpr node);
    void caseAAttrAssignExpr(AAttrAssignExpr node);
    void caseAAttrReassignExpr(AAttrReassignExpr node);
    void caseACallExpr(ACallExpr node);
    void caseACallAssignExpr(ACallAssignExpr node);
    void caseACallReassignExpr(ACallReassignExpr node);
    void caseASuperExpr(ASuperExpr node);
    void caseAInitExpr(AInitExpr node);
    void caseABraExpr(ABraExpr node);
    void caseABraAssignExpr(ABraAssignExpr node);
    void caseABraReassignExpr(ABraReassignExpr node);
    void caseAClosureCallExpr(AClosureCallExpr node);
    void caseAVarExpr(AVarExpr node);
    void caseAVarAssignExpr(AVarAssignExpr node);
    void caseAVarReassignExpr(AVarReassignExpr node);
    void caseARangeExpr(ARangeExpr node);
    void caseACrangeExpr(ACrangeExpr node);
    void caseAOrangeExpr(AOrangeExpr node);
    void caseAArrayExpr(AArrayExpr node);
    void caseASelfExpr(ASelfExpr node);
    void caseAImplicitSelfExpr(AImplicitSelfExpr node);
    void caseATrueExpr(ATrueExpr node);
    void caseAFalseExpr(AFalseExpr node);
    void caseANullExpr(ANullExpr node);
    void caseAIntExpr(AIntExpr node);
    void caseAFloatExpr(AFloatExpr node);
    void caseACharExpr(ACharExpr node);
    void caseAStringExpr(AStringExpr node);
    void caseAStartStringExpr(AStartStringExpr node);
    void caseAMidStringExpr(AMidStringExpr node);
    void caseAEndStringExpr(AEndStringExpr node);
    void caseASuperstringExpr(ASuperstringExpr node);
    void caseAParExpr(AParExpr node);
    void caseAAsCastExpr(AAsCastExpr node);
    void caseAAsNotnullExpr(AAsNotnullExpr node);
    void caseAIssetAttrExpr(AIssetAttrExpr node);
    void caseAPlusAssignOp(APlusAssignOp node);
    void caseAMinusAssignOp(AMinusAssignOp node);
    void caseAClosureDef(AClosureDef node);
    void caseASimpleClosureId(ASimpleClosureId node);
    void caseABreakClosureId(ABreakClosureId node);
    void caseAModuleName(AModuleName node);
    void caseAExternCalls(AExternCalls node);
    void caseAExternCall(AExternCall node);
    void caseASuperExternCall(ASuperExternCall node);
    void caseALocalPropExternCall(ALocalPropExternCall node);
    void caseAFullPropExternCall(AFullPropExternCall node);
    void caseAInitPropExternCall(AInitPropExternCall node);
    void caseACastAsExternCall(ACastAsExternCall node);
    void caseAAsNullableExternCall(AAsNullableExternCall node);
    void caseAAsNotNullableExternCall(AAsNotNullableExternCall node);
    void caseAQualified(AQualified node);
    void caseADoc(ADoc node);

    void caseTBlank(TBlank node);
    void caseTEol(TEol node);
    void caseTComment(TComment node);
    void caseTKwmodule(TKwmodule node);
    void caseTKwimport(TKwimport node);
    void caseTKwclass(TKwclass node);
    void caseTKwabstract(TKwabstract node);
    void caseTKwinterface(TKwinterface node);
    void caseTKwenum(TKwenum node);
    void caseTKwspecial(TKwspecial node);
    void caseTKwend(TKwend node);
    void caseTKwmeth(TKwmeth node);
    void caseTKwtype(TKwtype node);
    void caseTKwinit(TKwinit node);
    void caseTKwredef(TKwredef node);
    void caseTKwis(TKwis node);
    void caseTKwdo(TKwdo node);
    void caseTKwreadable(TKwreadable node);
    void caseTKwwritable(TKwwritable node);
    void caseTKwvar(TKwvar node);
    void caseTKwintern(TKwintern node);
    void caseTKwextern(TKwextern node);
    void caseTKwprotected(TKwprotected node);
    void caseTKwprivate(TKwprivate node);
    void caseTKwintrude(TKwintrude node);
    void caseTKwif(TKwif node);
    void caseTKwthen(TKwthen node);
    void caseTKwelse(TKwelse node);
    void caseTKwwhile(TKwwhile node);
    void caseTKwloop(TKwloop node);
    void caseTKwfor(TKwfor node);
    void caseTKwin(TKwin node);
    void caseTKwand(TKwand node);
    void caseTKwor(TKwor node);
    void caseTKwnot(TKwnot node);
    void caseTKwreturn(TKwreturn node);
    void caseTKwcontinue(TKwcontinue node);
    void caseTKwbreak(TKwbreak node);
    void caseTKwabort(TKwabort node);
    void caseTKwassert(TKwassert node);
    void caseTKwnew(TKwnew node);
    void caseTKwisa(TKwisa node);
    void caseTKwonce(TKwonce node);
    void caseTKwsuper(TKwsuper node);
    void caseTKwself(TKwself node);
    void caseTKwtrue(TKwtrue node);
    void caseTKwfalse(TKwfalse node);
    void caseTKwnull(TKwnull node);
    void caseTKwas(TKwas node);
    void caseTKwnullable(TKwnullable node);
    void caseTKwisset(TKwisset node);
    void caseTKwlabel(TKwlabel node);
    void caseTOpar(TOpar node);
    void caseTCpar(TCpar node);
    void caseTObra(TObra node);
    void caseTCbra(TCbra node);
    void caseTComma(TComma node);
    void caseTColumn(TColumn node);
    void caseTQuad(TQuad node);
    void caseTAssign(TAssign node);
    void caseTPluseq(TPluseq node);
    void caseTMinuseq(TMinuseq node);
    void caseTDotdotdot(TDotdotdot node);
    void caseTDotdot(TDotdot node);
    void caseTDot(TDot node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTStar(TStar node);
    void caseTSlash(TSlash node);
    void caseTPercent(TPercent node);
    void caseTEq(TEq node);
    void caseTNe(TNe node);
    void caseTLt(TLt node);
    void caseTLe(TLe node);
    void caseTLl(TLl node);
    void caseTGt(TGt node);
    void caseTGe(TGe node);
    void caseTGg(TGg node);
    void caseTStarship(TStarship node);
    void caseTBang(TBang node);
    void caseTClassid(TClassid node);
    void caseTId(TId node);
    void caseTAttrid(TAttrid node);
    void caseTNumber(TNumber node);
    void caseTFloat(TFloat node);
    void caseTChar(TChar node);
    void caseTString(TString node);
    void caseTStartString(TStartString node);
    void caseTMidString(TMidString node);
    void caseTEndString(TEndString node);
    void caseTBadChar(TBadChar node);
    void caseTBadString(TBadString node);
    void caseEOF(EOF node);
}
